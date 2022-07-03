package com.japik.services.simple;

import com.japik.service.AService;
import com.japik.service.AServiceConnection;
import com.japik.service.ServiceConnectionParams;
import com.japik.service.ServiceParams;
import com.japik.services.simple.shared.ISimpleServiceConnection;
import org.jetbrains.annotations.NotNull;

public class SimpleService extends AService<ISimpleServiceConnection> {

    public SimpleService(ServiceParams serviceParams) {
        super(serviceParams);
    }

    @Override
    protected ISimpleServiceConnection createServiceConnection(ServiceConnectionParams params) {
        return new SimpleServiceConnection(this, params);
    }

    private static class SimpleServiceConnection extends AServiceConnection<SimpleService, ISimpleServiceConnection>
            implements ISimpleServiceConnection{

        public SimpleServiceConnection(@NotNull SimpleService service, ServiceConnectionParams params) {
            super(service, params);
        }
    }
}
