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
            // InetAddress address = InetAddress.getByName("169.254.0.0");
            // System.out.println("is LinkLocalAddress():" + address.isLinkLocalAddress());

            // SitelocalAddress check
            // sitelocaladress ranges from 10.0.0.0 to 10.255.255.255 or 172.16.0.0 to
            // 172.31.255.255 or 192.168.0.0 to 192.168.255.255
            // 192.168.x.x
            // InetAddress address = InetAddress.getByName("10.0.0.0");
            // InetAddress address = InetAddress.getByName("192.168.0.0");

            // System.out.println("is LinkLocalAddress():" + address.isSiteLocalAddress());

            // isMulticastAddress() check - It ranges from 224.0.0.0 to 239.255.255.255
            // InetAddress address = InetAddress.getByName("224.0.0.0");
            // System.out.println("is LinkLocalAddress():" + address.isMulticastAddress());
            // isMCGlobal() check -It ranges from 224.0.1.0 to 238.255.255.255
            InetAddress address = InetAddress.getByName("224.0.1.0");
            System.out.println(address.isMCGlobal());
            System.out.println();

            // is MCOrgLocal() check ranges from FF0E to FF1E
            InetAddress orgLocal = InetAddress.getByName("FF08::1");
            System.out.println("Address: " + orgLocal.getHostAddress());
            System.out.println("isMCOrgLocal(): " + orgLocal.isMCOrgLocal());
            System.out.println();

            // is MulticastSiteLocal() check -IPv6 Site-Local multicast range: FF05::/16
            InetAddress siteLocal = InetAddress.getByName("FF05::1");
            System.out.println("Address: " + siteLocal.getHostAddress());
            System.out.println("isMCSiteLocal(): " + siteLocal.isMCSiteLocal());
            System.out.println();

            // is MulticastLinkLocal() check
            // IPv4 Link-Local multicast range: 224.0.0.0 – 224.0.0.255
            // IPv6 Link-Local multicast range: FF02::/16
            InetAddress linkLocal = InetAddress.getByName("FF02::1");
            System.out.println("Address: " + linkLocal.getHostAddress());
            System.out.println("isMCLinkLocal(): " + linkLocal.isMCLinkLocal());
            System.out.println();

            // is MulticastNodeLocal() check IPv6 Node-Local multicast range: FF01::/16
            InetAddress nodeLocal = InetAddress.getByName("FF01::1");
            System.out.println("Address: " + nodeLocal.getHostAddress());
            System.out.println("isMCNodeLocal(): " + nodeLocal.isMCNodeLocal());
            System.out.println();

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
// Site-Local address can be used within a private network
