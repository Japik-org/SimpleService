package com.pro100kryto.server.services;

import com.pro100kryto.server.service.AServiceType;
import com.pro100kryto.server.service.Service;
import com.pro100kryto.server.services.simple.connection.ISimpleServiceConnection;

public class SimpleService extends AServiceType<ISimpleServiceConnection> {

    public SimpleService(Service service) {
        super(service);
    }

    @Override
    protected ISimpleServiceConnection createServiceConnection() {
        return null;
    }
}
