package org.galatea.starter.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
public class IexHistoricalPrices {
  private BigDecimal close;
  private BigDecimal high;
  private BigDecimal low;
  private BigDecimal open;
  private String symbol;
  private int volume;
  private String date;

  //no date format
  public IexHistoricalPrices(BigDecimal close, BigDecimal high, BigDecimal low, BigDecimal open, String symbol,
      int volume, String id, String key, String subkey, String date, float updated, BigDecimal changeOverTime, BigDecimal mktChangeOverTime,
      BigDecimal uOpen, BigDecimal uClose, BigDecimal uHigh, BigDecimal uLow, int uVolume, BigDecimal fOpen, BigDecimal fClose, BigDecimal fHigh, BigDecimal fLow,
      int fVolume, String label, BigDecimal change, BigDecimal changePercent) {
    this.close = close;
    this.high = high;
    this.low = low;
    this.open = open;
    this.symbol = symbol;
    this.volume = volume;
    this.date = date;

  }

  //with date
  public IexHistoricalPrices(BigDecimal avg, BigDecimal close, String date, BigDecimal high, BigDecimal low, BigDecimal mktAvg,
      BigDecimal mktClose, BigDecimal mktHigh, BigDecimal mktLow, BigDecimal mktNotional, int mktNumTrades, BigDecimal mktOpen,
      int mktVol, BigDecimal notional, int numTrades, BigDecimal open, int volume, String minute, String label,
      BigDecimal changeOverTime, BigDecimal mktChangeOverTime) {
    this.close = close;
    this.high = high;
    this.low = low;
    this.open = open;
    this.symbol = symbol;
    this.volume = volume;
    this.date = date;
  }
}
