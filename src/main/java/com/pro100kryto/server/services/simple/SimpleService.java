package com.pro100kryto.server.services.simple;

import com.pro100kryto.server.logger.ILogger;
import com.pro100kryto.server.service.AService;
import com.pro100kryto.server.service.AServiceConnectionImpl;
import com.pro100kryto.server.service.ServiceParams;
import com.pro100kryto.server.services.simple.connection.ISimpleServiceConnection;
import org.jetbrains.annotations.NotNull;

public class SimpleService extends AService<ISimpleServiceConnection> {

    public SimpleService(ServiceParams serviceParams) {
        super(serviceParams);
    }

    @Override
    public ISimpleServiceConnection createServiceConnection() {
        return new SimpleServiceConnection(this, logger);
    }

    private static class SimpleServiceConnection extends AServiceConnectionImpl<SimpleService, ISimpleServiceConnection>
            implements ISimpleServiceConnection{

        public SimpleServiceConnection(@NotNull SimpleService service, ILogger logger) {
            super(service, logger);
        }

        @Override
        protected void onClose() {
        }
    }
}
