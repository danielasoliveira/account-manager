package br.com.companyName.account.domain.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {

    @Override
    public ZonedDateTime deserialize(JsonParser jsonParser,
                                     DeserializationContext deserializationContext)
            throws IOException {

        LocalDate localDate = Instant.ofEpochMilli(jsonParser.getValueAsLong())
                .atZone(ZoneId.systemDefault()).toLocalDate();

        return localDate.atStartOfDay(ZoneOffset.UTC);
    }
}
