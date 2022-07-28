package org.galatea.starter.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.galatea.starter.domain.IexHistoricalPrices;
import org.galatea.starter.domain.IexLastTradedPrice;
import org.galatea.starter.domain.IexSymbol;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * A layer for transformation, aggregation, and business required when retrieving data from IEX.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class IexService {

  @NonNull
  private IexClient iexClient;


  /**
   * Get all stock symbols from IEX.
   *
   * @return a list of all Stock Symbols from IEX.
   */
  public List<IexSymbol> getAllSymbols() {
    return iexClient.getAllSymbols();
  }

  /**
   * Get the last traded price for each Symbol that is passed in.
   *
   * @param symbols the list of symbols to get a last traded price for.
   * @return a list of last traded price objects for each Symbol that is passed in.
   */
  public List<IexLastTradedPrice> getLastTradedPriceForSymbols(final List<String> symbols) {
    if (CollectionUtils.isEmpty(symbols)) {
      return Collections.emptyList();
    } else {
      return iexClient.getLastTradedPriceForSymbols(symbols.toArray(new String[0]));
    }
  }

  /**
   *
   * @param symbol symbol of stock to get list of historical prices for
   * @param range range of time historical prices cover
   * @param date start date of range
   * @return list of symbol's prices over certain timestamps
   */
  public List<IexHistoricalPrices> getHistoricalPricesForSymbols(final String symbol, final String range, final String date) {
    //List<IexHistoricalPrices> historicalPrices = iexClient.getHistoricalPricesForSymbols(symbol, range, date);
    return iexClient.getHistoricalPricesForSymbols(symbol, range, date);
  }


}
