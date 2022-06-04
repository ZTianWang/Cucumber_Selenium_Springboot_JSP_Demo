package nz.ac.auckland.se754.web.stepdefs;

import io.cucumber.java.AfterStep;

public class Hooks {
    @AfterStep
    public void afterEachStep() {
        // to make the test at human speed
        if (System.getenv("headless") == null || !System.getenv("headless").equals("true")) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
