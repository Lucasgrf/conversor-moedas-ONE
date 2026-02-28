package br.com.alura.conversor.service;

import br.com.alura.conversor.domain.Currency;
import br.com.alura.conversor.domain.ExchangeResponse;

public interface ExchangeService {
    ExchangeResponse getExchange(Currency base, Currency target);
}
