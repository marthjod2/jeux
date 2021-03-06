package de.fhb.jeux.session;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import de.fhb.jeux.mockentity.MockGroupEntity;
import de.fhb.jeux.model.IGroup;

@Stateless
public class CreateNewGroupBean implements CreateNewGroupRemote,
		CreateNewGroupLocal {

	protected static Logger logger = Logger.getLogger(CreateNewGroupBean.class);

	private final Gson gson;

	public CreateNewGroupBean() {
		this.gson = new Gson();
	}

	@Override
	public boolean createNewGroup(String jsonRepresentation) {
		boolean success = false;

		IGroup group = gson.fromJson(jsonRepresentation.toString(),
				MockGroupEntity.class);

		return success;
	}

}
