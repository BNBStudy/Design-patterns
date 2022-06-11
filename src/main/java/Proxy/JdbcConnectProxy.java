package Proxy;

import java.util.Map;

public class JdbcConnectProxy implements JdbcConnect {

    private final JdbcConnectImpl jdbcConnect;
    private Map<Integer, String > cahe;
    private String localUrl;

    public JdbcConnectProxy(JdbcConnectImpl jdbcConnect) {
        this.jdbcConnect = jdbcConnect;
    }

    @Override
    public String getUrl(int rowNumber) {
        if (!cahe.containsKey(rowNumber)) {
           String url = jdbcConnect.getUrl(rowNumber);
           String localUrl = "localhost:8080/" + url;
           cahe.put(rowNumber, localUrl);
        } else {
            localUrl = "localhost:8080/" + cahe.get(rowNumber);
        }
        return localUrl;
    }
}
