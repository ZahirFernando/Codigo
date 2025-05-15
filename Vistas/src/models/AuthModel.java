package models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AuthModel {

    public AuthModel() {
    }

    public boolean login(String email, String password) {
        String url = this.getClass().getResource("/files/users.txt").getPath();

        try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            String line = reader.readLine();

            while (line != null) {
                String[] data = line.split(",");
                if (data.length >= 4 && email.equals(data[2]) && password.equals(data[3])) {
                    return true;
                }
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    
    public boolean guardarUsuario(String nombre, String bio, String preferencias, String email, String password, String colonia) {
        try {
            String path = this.getClass().getResource("/files/users.txt").getPath();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true)); 

           
            writer.write(nombre + "," + bio + "," + email + "," + password + "," + preferencias + "," + colonia);
            writer.newLine();
            writer.close();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}


