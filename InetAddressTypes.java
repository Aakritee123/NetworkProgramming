import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTypes {
    public static void main(String[] args) {
        try {
            // InetAddress address = InetAddress.getByName("0.0.0.0");
            InetAddress address = InetAddress.getByName("localhost");

            // isanylocaladdress check
            // System.out.println("is AnyLocalAddress():" + address.isAnyLocalAddress());

            // isanyloopbackaddress check
            System.out.println("is LoopAddress():" + address.isLoopbackAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();

        }
    }
}
// Address Types:
// Any local address
// is AnyLocalAddress():0.0.0.0 ->Wildwcard address
// if device is not assigned with any IP address //id evice wants to listen all
// interface
// Loopback address means device connecting with itself -eg.localhostaddress
// -isLoopbackAddess()
