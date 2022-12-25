package com.japik.services.simple;

import com.japik.service.AService;
import com.japik.service.AServiceConnection;
import com.japik.service.ServiceConnectionParams;
import com.japik.service.ServiceParams;
import com.japik.services.simple.shared.ISimpleServiceConnection;
import org.jetbrains.annotations.NotNull;

import java.rmi.RemoteException;

public class SimpleService extends AService<ISimpleServiceConnection> {

    public SimpleService(ServiceParams serviceParams) {
        super(serviceParams);
    }

    @Override
    protected ISimpleServiceConnection createServiceConnection(ServiceConnectionParams params) throws RemoteException {
        return new SimpleServiceConnection(this, params);
    }

    private static class SimpleServiceConnection extends AServiceConnection<SimpleService, ISimpleServiceConnection>
            implements ISimpleServiceConnection{

        public SimpleServiceConnection(@NotNull SimpleService service, ServiceConnectionParams params) throws RemoteException {
            super(service, params);
        }
    }
}
