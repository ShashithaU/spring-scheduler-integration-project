package edu.icet.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StockService {
   public void processMinReorderLevels() {
        log.info("Processing min reorder levels");
    }
}
