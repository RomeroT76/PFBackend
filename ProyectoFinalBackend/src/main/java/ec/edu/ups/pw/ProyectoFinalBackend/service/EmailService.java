package ec.edu.ups.pw.ProyectoFinalBackend.service;

import com.resend.Resend;
import com.resend.core.exception.ResendException;
import com.resend.services.emails.model.CreateEmailOptions;
import com.resend.services.emails.model.CreateEmailResponse;

import ec.edu.ups.pw.ProyectoFinalBackend.model.EmailRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/email")
public class EmailService {
	
	private static final String RESEND_API_KEY = "re_gvYoPeRW_23uod8Bkp2eKjyVeyA1fxMLS";
	
	@POST
    @Path("/send")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String sendEmail(EmailRequest request) {
        Resend resend = new Resend(RESEND_API_KEY);

        CreateEmailOptions params = CreateEmailOptions.builder()
                .from(request.getFrom())
                .to(request.getTo())
                .subject(request.getSubject())
                .html(request.getHtmlContent())
                .build();

        try {
            CreateEmailResponse data = resend.emails().send(params);
            return "Email sent successfully. ID: " + data.getId();
        } catch (ResendException e) {
            e.printStackTrace();
            return "Error sending email: " + e.getMessage();
        }
    }
}
