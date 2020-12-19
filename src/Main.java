import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //

        System.out.println("========== BINARY IPS =============");

        String oneByte = "((0|1){8})";
        String regex = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";
        String[] addresses = new String[10];

        addresses[0] = "00101001.00000111.00110101.00100011";
        addresses[1] = "01111110.11111010.11000010.01001111";
        addresses[2] = "11111100.10001100.00011011.110111111";
        addresses[3] = "111011011.01101010.00111110.11111101";
        addresses[4] = "11000010.11111110.00011110.01111110";
        addresses[5] = "10100011.10100010.01111110.00110110";
        addresses[6] = "111011011.01101010.00111110.11111101";
        addresses[7] = "11001100.00101100.11001101.11111101";
        addresses[8] = "10110000.00010100.10000010.00110111";
        addresses[9] = "10111100.11100001.10011000.00100001";

        Pattern pattern = Pattern.compile(regex);


        for (String address: addresses) {
            Matcher matcher = pattern.matcher(address);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(address + " не корректен");
        }

        System.out.println("========== OCTAL IPS =============");

        oneByte = "([0-7]{1,2}|[0-3][0-7]{2})";
        regex = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";


        addresses[0] = "312.220.211.063";
        addresses[1] = "025.354.213.341";
        addresses[2] = "355.324.136.555";
        addresses[3] = "355.324.136.555";
        addresses[4] = "027.313.375.203";
        addresses[5] = "222.364.223.223";
        addresses[6] = "107.203.026.274";
        addresses[7] = "166.145.230.114";
        addresses[8] = "224.340.303.400";
        addresses[9] = "027.313.375.203";

        pattern = Pattern.compile(regex);

        for (String address: addresses) {
            Matcher matcher = pattern.matcher(address);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(address + " не корректен");
        }

        System.out.println("========== HEXADECIMAL IPS =============");

        oneByte = "(\\d{1,2}|\\d[a-f]|[a-f]\\d|[a-f]{1,2})";
        regex = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";

        addresses[0] = "cb.d3.eb.94";
        addresses[1] = "7f.100.e6.ee";
        addresses[2] = "08.8b.a9.fff";
        addresses[3] = "1c.7c.9a.53";
        addresses[4] = "a7.2f.cb.4a";
        addresses[5] = "abc.a2.3f.cc";
        addresses[6] = "21.47.02.45";
        addresses[7] = "bf.cb.81.e6";
        addresses[8] = "0f.5e.e5.58";
        addresses[9] = "1d.7f.d2.32";


        pattern = Pattern.compile(regex);

        for (String address: addresses) {
            Matcher matcher = pattern.matcher(address);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(address + " не корректен");
        }

        System.out.println("================= DECIMAL IPS =================");

        oneByte = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        regex = "^" + oneByte + "\\." + oneByte + "\\." + oneByte + "\\." + oneByte + "$";

        addresses[0] = "221.80.250.91";
        addresses[1] = "80.232.65.220";
        addresses[2] = "205.264.92.125";
        addresses[3] = "1.168.111.69";
        addresses[4] = "20.7.256.167";
        addresses[5] = "17.2282.213.63";
        addresses[6] = "29.192.220.120";
        addresses[7] = "16.203.39.255";
        addresses[8] = "177.204.237.247";
        addresses[9] = "1.34.161.167";

        pattern = Pattern.compile(regex);

        for (String address: addresses) {
            Matcher matcher = pattern.matcher(address);
            if (matcher.find())
                System.out.println(matcher.group() + " корректен");
            else
                System.out.println(address + " не корректен");
        }


    }

}
