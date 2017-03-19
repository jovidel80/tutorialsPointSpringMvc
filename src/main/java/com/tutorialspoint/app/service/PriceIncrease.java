package com.tutorialspoint.app.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by jose on 19/03/2017.
 */
public class PriceIncrease {
    protected final Log logger = LogFactory.getLog(getClass());

    @Min(0)
    @Max(50)
    private int percentage;

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
        logger.info("Percentage set to " + percentage);
    }
}
