package org.prgrms.vouchermanager.domain;

import java.util.UUID;

public interface Voucher {
    UUID getVoucherId();

    long discount(long beforeDiscount);
}
