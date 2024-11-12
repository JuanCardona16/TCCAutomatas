package qwer.maquina.de.turin.modules.MaquinaDeTurin.services;

import org.springframework.stereotype.Service;

@Service
public class MaquinaDeTurin {

    private int shift;

    public MaquinaDeTurin() {
        this.shift = 3; // Valor de desplazamiento por defecto
    }

    public String encrypt(String text, int shift) {
        return processText(text, shift);
    }

    public String decrypt(String text, int shift) {
        return processText(text, -shift);
    }

    // Método para procesar el texto aplicando el desplazamiento
    private String processText(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            result.append(shiftCharacter(c, shift));
        }
        return result.toString();
    }

    // Función auxiliar para desplazar el carácter
    private char shiftCharacter(char c, int shift) {
        if (Character.isLetter(c)) {
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            return (char) ((c - base + shift + 26) % 26 + base);
        }
        return c;
    }

}
