package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import scripts.DashBoardTestCase;
import scripts.LoginTestCase;
import scripts.LtBrowserTestCase;

@RunWith(Suite.class)
@SuiteClasses({LoginTestCase.class,DashBoardTestCase.class,LtBrowserTestCase.class})

public class Driver {

}
