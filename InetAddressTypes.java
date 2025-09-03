import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTypes {
    public static void main(String[] args) {
        try {
            // InetAddress address = InetAddress.getByName("0.0.0.0");
            // InetAddress address = InetAddress.getByName("localhost");

            // isanylocaladdress check
            // System.out.println("is AnyLocalAddress():" + address.isAnyLocalAddress());

            // isanyloopbackaddress check
            // System.out.println("is LoopAddress():" + address.isLoopbackAddress());

            // Link-localAddress check
            // InetAddress address = InetAddress.getByName("FE80:0000:0000::0000");
            InetAddress address = InetAddress.getByName("169.254.0.0");
            System.out.println("is LinkLocalAddress():" + address.isLinkLocalAddress());

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
// Link-local address is an IP address that is intended for use only within the
// communicate with sensor devices on a local network
// segment.Example:169.254.x.x
