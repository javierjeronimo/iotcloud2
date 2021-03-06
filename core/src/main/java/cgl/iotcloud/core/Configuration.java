package cgl.iotcloud.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class Configuration {
    private static Logger LOG = LoggerFactory.getLogger(Configuration.class);

    public static final String IOT_HOME ="iot.home";

    public static final String IOT_MASTER_SERVER_HOST = "iot.master.host";
    public static final String IOT_MASTER_SERVER_PORT = "iot.master.server.port";
    public static final String IOT_MASTER_API_PORT = "iot.master.api.port";
    public static final String IOT_MASTER_API_THREADS = "iot.master.api.threads";
    public static final String IOT_MASTER_SERVER_THREADS = "iot.master.server.threads";

    public static final String IOT_SENSORSITE_PORT = "iot.sensorsite.port";
    public static final String IOT_SENSORSITE_THREADS = "iot.sensorsite.threads";
    public static final String IOT_SENSORSITE_HOST = "iot.sensorsite.host";
    public static final String IOT_SENSORSITE_ID = "iot.sensorsite.id";
    public static final String IOT_SENSORSITE_REPOSITORY = "iot.sensorsite.repository";

    // the maximum number of sensor sites possible
    public static final String IOT_SENSOR_SITES_MAX = "iot.sensorsites.max";
    public static final String IOT_SENSORSITE_MAX_SENSOREVENTS = "iot.sensorsite.max.sensorevents";

    // transport specific configurations
    // this map holds the available transports
    public static final String IOT_SENSORSITE_TRANSPORTS = "iot.sensorsite.transports";
    public static final String IOT_SENSORSITE_TRANSPORT_CLASS = "class";

    // jms transport specific configurations
    public static final String IOT_SENSOR_SITE_CONFAC_JNDI_NAME = "jms.ConnectionFactoryJNDIName";

    // the name of the channel destination
    public static final String CHANNEL_JMS_DESTINATION = "destination";
    public static final String TRANSPORT_PROPERTIES = "properties";

    public static final String CHANNEL_JMS_IS_QUEUE = "isQueue";

    public static final String ZK_SERVERS = "iot.zk.servers";

    public static final String ZK_ROOT = "iot.zk.root";

    public static String getMasterHost(Map conf) {
        return (String) conf.get(IOT_MASTER_SERVER_HOST);
    }

    public static int getMasterServerPort(Map conf) {
        return (Integer) conf.get(IOT_MASTER_SERVER_PORT);
    }

    public static int getMasterServerThreads(Map conf) {
        return (Integer) conf.get(IOT_MASTER_SERVER_THREADS);
    }

    public static int getMasterAPIPort(Map conf) {
        return (Integer)conf.get(IOT_MASTER_API_PORT);
    }

    public static int getMasterAPIThreads(Map conf) {
        return (Integer)conf.get(IOT_MASTER_API_THREADS);
    }

    public static int getSensorSitePort(Map conf) {
        return (Integer) conf.get(IOT_SENSORSITE_PORT);
    }

    public static String getSensorSiteHost(Map conf) {
        return (String) conf.get(IOT_SENSORSITE_HOST);
    }

    public static String getSiteId(Map conf) {
        return (String) conf.get(IOT_SENSORSITE_ID);
    }

    public static int getSensorSiteThreads(Map conf) {
        return (Integer) conf.get(IOT_SENSORSITE_THREADS);
    }

    public static Map getTransports(Map conf) {
        return (Map) conf.get(IOT_SENSORSITE_TRANSPORTS);
    }

    public static String getTransportClass(Map transportConf) {
        return (String) transportConf.get(IOT_SENSORSITE_TRANSPORT_CLASS);
    }

    public static String getChannelJmsDestination(Map channelConf) {
        return (String) channelConf.get(CHANNEL_JMS_DESTINATION);
    }

    public static String getChannelIsQueue(Map channelConf) {
        return (String) channelConf.get(CHANNEL_JMS_IS_QUEUE);
    }

    public static int getIotSensorSitesMax(Map conf) {
        return (Integer) conf.get(IOT_SENSOR_SITES_MAX);
    }
    
    public static int getSiteMaxSensorEvents(Map conf) {
        return (Integer) conf.get(IOT_SENSORSITE_MAX_SENSOREVENTS);
    }

    /**
     * In this property we give precedence to the configuration value
     * @param conf map with configuration
     * @return the iot home
     */
    public static String getIoTHome(Map conf) {
        String iotHome = (String) conf.get(IOT_HOME);
        if (iotHome == null) {
            return System.getProperty(IOT_HOME);
        } else {
            return iotHome;
        }
    }

    public static String getSensorRepositoryPath(Map conf) {
        return (String) conf.get(IOT_SENSORSITE_REPOSITORY);
    }

    public static String getZkRoot(Map conf) {
        Object val = conf.get(ZK_ROOT);
        if (val == null || !(val instanceof String)) {
            String msg = "ZooKeeper root must be specified";
            LOG.error(msg);
            throw new RuntimeException(msg);
        }

        return val.toString();
    }

    public static String getZkConnectionString(Map conf) {
        Object val = conf.get(ZK_SERVERS);
        if (val == null || !(val instanceof List)) {
            String message = "The zookeeper server must be specified";
            LOG.error(message);
            throw new RuntimeException(message);
        }

        List servers = (List) val;

        String ret = "";
        for (Object o : servers) {
            ret += o.toString();
        }

        return ret;
    }
}
