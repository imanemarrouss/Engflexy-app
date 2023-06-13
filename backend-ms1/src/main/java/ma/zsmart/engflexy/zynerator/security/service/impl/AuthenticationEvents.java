package ma.zsmart.engflexy.zynerator.security.service.impl;

import ma.zsmart.engflexy.zynerator.security.service.facade.UserService;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEvents {
    private UserService userService;

    public AuthenticationEvents(UserService userService) {
        this.userService = userService;
    }

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent success){
        userService.updateSuccessfulLogin(success.getAuthentication().getName());
        System.out.println("success");
    }

    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent failures) {
        userService.updateFailedLogin(failures.getAuthentication().getName());
        System.out.println("login failed");

        if (failures.getException() != null) {
            System.out.println("Exception: " + failures.getException().getMessage());
        }

        userService.updateFailedLogin(failures.getAuthentication().getName());
    }
}
