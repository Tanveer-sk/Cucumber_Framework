package com.inportia.batch03Framework.stepDefs;

import com.inportia.batch03Framework.pageObjects.LayerOne;

import cucumber.api.java.en.Given;

public class LoginSteps {

	
	LayerOne layer_one = new LayerOne();
	


	@Given("^go to practice page$")
	public void go_to_practice_page() throws Throwable {
        layer_one.open_traget_page();
	}

	@Given("^select \"([^\"]*)\" radio button on layer one$")
	public void select_radio_button_on_layer_one(String arg1) throws Throwable {
	   layer_one.select_radio_button(arg1);
	}


}
