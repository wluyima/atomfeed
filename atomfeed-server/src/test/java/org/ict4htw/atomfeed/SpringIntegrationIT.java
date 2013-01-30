package org.ict4htw.atomfeed;

import org.ict4htw.atomfeed.server.repository.hibernate.DataAccessTemplate;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:atomFeedContext.xml")
@Transactional
public abstract class SpringIntegrationIT {

    protected DataAccessTemplate template;
    
}