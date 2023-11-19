import javax.comm.*;
import java.io.*;

public class SendSMS {
    public static void main(String[] args) {
        // Initialize the modem and configure it
        // Open the serial port and create input and output streams

        try {
            OutputStream outputStream = serialPort.getOutputStream();
            InputStream inputStream = serialPort.getInputStream();

            // Configure the modem with AT commands
            outputStream.write("AT\r".getBytes());
            // More AT commands for modem configuration

            // Send an SMS
            outputStream.write("AT+CMGF=1\r".getBytes()); // Set SMS text mode
            outputStream.write("AT+CMGS=\"+1234567890\"\r".getBytes()); // Recipient phone number
            outputStream.write("Hello, this is an offline SMS!\u001A\r".getBytes()); // SMS text and Ctrl+Z

            // Close the streams and the serial port
            outputStream.close();
            inputStream.close();
            serialPort.close();
        } catch (IOException | PortInUseException | UnsupportedCommOperationException ex) {
            ex.printStackTrace();
        }
    }
}
