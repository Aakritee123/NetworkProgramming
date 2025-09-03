//Day 1: Working with InetAddress in Java

import java.net.InetAddress;

public class InetExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());
            // using these methods to retrieve information about the InetAddress object.
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            byte[] ipBytes = address.getAddress();
            System.out.print("Raw IP Address (byte array): ");
            for (byte b : ipBytes) {
                System.out.print((b & 0xFF) + " ");
            }
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Getter Methods:
// getHostName(): Returns the host name of the IP address.
// getCanonicalHostName(): Returns the fully qualified domain name for this IP
// address.
// getHostAddress(): Returns the IP address in textual format.
// getAddress(): Returns the raw IP address in byte array format.
// use these methods to retrieve information about the InetAddress object.
