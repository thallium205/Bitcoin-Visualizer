package com.bitcoinvisualizer.server.guice;

import com.google.inject.servlet.ServletModule;
import com.gwtplatform.dispatch.shared.ActionImpl;
import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;
import com.gwtplatform.dispatch.server.guice.DispatchServiceImpl;

public class DispatchServletModule extends ServletModule
{

	@Override
	public void configureServlets()
	{
		serve("/" + ActionImpl.DEFAULT_SERVICE_NAME).with(DispatchServiceImpl.class);
		// serve("/" + UnsecuredActionImpl.DEFAULT_SERVICE_NAME).with(DispatchServiceImpl.class);
	}
}
