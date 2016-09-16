package com.M2I.ecommerce.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.M2I.ecommerce.beans.Client;

public class ClientREST {
	public static void lister() {
		ClientConfig config = new ClientConfig();
		javax.ws.rs.client.Client jClient = ClientBuilder.newClient(config);
		WebTarget target = jClient.target(getBaseURI());
		List<Client> clients = target.path("rest").path("client").path("lister").request()
				.accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Client>>() {
				});
		System.out.println("clients : " + clients);
		int i = 1;
		for (Client client : clients) {
			System.out.println("Client " + i++ + " nom : " + client.nom);
		}
		
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/ECommerce").build();
	}

}
