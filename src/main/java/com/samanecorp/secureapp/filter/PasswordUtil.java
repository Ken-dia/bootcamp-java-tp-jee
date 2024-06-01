package com.samanecorp.secureapp.filter;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {
	// Méthode pour hacher un mot de passe
    public static String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

    // Méthode pour vérifier un mot de passe
    public static boolean checkPassword(String plainTextPassword, String hashedPassword) {
        return BCrypt.checkpw(plainTextPassword, hashedPassword);
    }
}
