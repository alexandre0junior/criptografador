import javax.swing.JOptionPane;

public class SimpleEncryption {
    public static void main(String[] args) {
        // Solicita ao usuário a entrada da String
        String input = JOptionPane.showInputDialog("Digite a mensagem para criptografar:");
        
        if (input != null && !input.isEmpty()) {
            char[] charArray = input.toCharArray(); // Converte para vetor de caracteres
            int[] asciiArray = new int[charArray.length];
            char[] encryptedArray = new char[charArray.length];
            
            // Converte para ASCII e soma 10
            for (int i = 0; i < charArray.length; i++) {
                asciiArray[i] = (int) charArray[i] + 10;
                encryptedArray[i] = (char) asciiArray[i];
            }
            
            // Converte vetor de caracteres criptografados para String
            String encryptedString = new String(encryptedArray);
            
            // Exibe a mensagem criptografada
            JOptionPane.showMessageDialog(null, "Mensagem criptografada: " + encryptedString);
        } else {
            JOptionPane.showMessageDialog(null, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}