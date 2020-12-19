import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== HEXADECIMAL IPS =============");

        String oneByte = "(\\d{1,2}|\\d[a-f]|[a-f]\\d|[a-f]{1,2})";
        String regexp = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";
        String[] ip_addr = new String[10];

        ip_addr[0] = "08.8b.a9.fff";
        ip_addr[1] = "21.47.02.45";
        ip_addr[2] = "0f.5e.e5.58";
        ip_addr[3] = "7f.100.e6.ee";
        ip_addr[4] = "cb.d3.eb.94";
        ip_addr[5] = "bf.cb.81.e6";
        ip_addr[6] = "1d.7f.d2.32";
        ip_addr[7] = "1c.7c.9a.53";
        ip_addr[8] = "abc.a2.3f.cc";
        ip_addr[9] = "a7.2f.cb.4a";


        Pattern p = Pattern.compile(regexp);

        for (String address: ip_addr) {
            Matcher matcher = p.matcher(address);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(address + " не корректен");
        }

        System.out.println("================= DECIMAL IPS =================");

        oneByte = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        regexp = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";

        ip_addr[0] = "1.168.111.69";
        ip_addr[1] = "29.192.220.120";
        ip_addr[2] = "16.203.39.255";
        ip_addr[3] = "205.264.92.125";
        ip_addr[4] = "1.34.161.167";
        ip_addr[5] = "221.80.250.91";
        ip_addr[6] = "20.7.256.167";
        ip_addr[7] = "80.232.65.220";
        ip_addr[8] = "177.204.237.247";
        ip_addr[9] = "17.2282.213.63";

        p = Pattern.compile(regexp);

        for (String address: ip_addr) {
            Matcher matcher = p.matcher(address);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(address + " не корректен");
        }

        System.out.println("========== BINARY IPS =============");

        oneByte = "((0|1){8})";
        regexp = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";

        ip_addr[0] = "111011011.01101010.00111110.11111101";
        ip_addr[1] = "10111100.11100001.10011000.00100001";
        ip_addr[2] = "111011011.01101010.00111110.11111101";
        ip_addr[3] = "10100011.10100010.01111110.00110110";
        ip_addr[4] = "01111110.11111010.11000010.01001111";
        ip_addr[5] = "00101001.00000111.00110101.00100011";
        ip_addr[6] = "11001100.00101100.11001101.11111101";
        ip_addr[7] = "10110000.00010100.10000010.00110111";
        ip_addr[8] = "11111100.10001100.00011011.110111111";
        ip_addr[9] = "11000010.11111110.00011110.01111110";

        p = Pattern.compile(regexp);

        for (String ip: ip_addr) {
            Matcher matcher = p.matcher(ip);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(ip + " не корректен");
        }

        System.out.println("========== OCTAL IPS =============");

        oneByte = "([0-7]{1,2}|[0-3][0-7]{2})";
        regexp = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";


        ip_addr[0] = "355.324.136.555";
        ip_addr[1] = "025.354.213.341";
        ip_addr[2] = "224.340.303.400";
        ip_addr[3] = "027.313.375.203";
        ip_addr[4] = "027.313.375.203";
        ip_addr[5] = "222.364.223.223";
        ip_addr[6] = "312.220.211.063";
        ip_addr[7] = "355.324.136.555";
        ip_addr[8] = "166.145.230.114";
        ip_addr[9] = "107.203.026.274";

        p = Pattern.compile(regexp);

        for (String address: ip_addr) {
            Matcher matcher = p.matcher(address);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(address + " не корректен");
        }


    }

}
