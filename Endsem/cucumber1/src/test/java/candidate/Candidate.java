package candidate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Candidate {

	
		
		@Given("I want to enter candidate details")
		public void i_want_to_enter_candidate_details() {
		   System.out.println("I want to enter candidate details");
		}

		@When("I set candidate name")
		public void i_set_candidate_name() {
			 System.out.println("I set candidate name");
		}

		@When("calculate total")
		public void calculate_total() {
			 System.out.println("calculate total");
		}

		@When("save")
		public void save() {
			 System.out.println("save");
		}

		@Then("The details should be saved in the database")
		public void the_details_should_be_saved_in_the_database() {
			 System.out.println("The details should be saved in the database");
		}
	

}
