package co.edu.univalle.util;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EncriptarPassword {

    static Logger logger = Logger.getLogger(EncriptarPassword.class.getName());

    public static void main(String[] args) {
        
        var password = "123";
        logger.log(Level.SEVERE, "password: {0} ", password);
        logger.log(Level.SEVERE,"password encriptado: {0} ", encriptarPassword(password));
    }
    
    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
