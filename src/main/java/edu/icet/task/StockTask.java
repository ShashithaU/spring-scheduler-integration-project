package edu.icet.task;


import edu.icet.service.StockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Log4j2
@RequiredArgsConstructor
@Component
public class StockTask {

    private final StockService stockService;


    @Scheduled(fixedRate = 50)
    void sheduleMinReorderLevels() {
        stockService.processMinReorderLevels();
    }

}
