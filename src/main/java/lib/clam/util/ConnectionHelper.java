package lib.clam.util;

import wf.bitcoin.javabitcoindrpcclient.BitcoinJSONRPCClient;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionHelper {

    private final static String user = "username";
    private final static String password = "password";
    private final static String host = "host";
    private final static String port = "port";

    public final static String connectionUrl = "http://" + user + ":" + password + "@"+ host +":"+ port +"/";

    public static BitcoinJSONRPCClient getClient() throws MalformedURLException {

        return new BitcoinJSONRPCClient(connectionUrl);

    }

}
