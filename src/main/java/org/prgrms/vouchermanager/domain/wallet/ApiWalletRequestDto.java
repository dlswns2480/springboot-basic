package org.prgrms.vouchermanager.domain.wallet;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ApiWalletRequestDto {
    private final String customerEmail;
    private final UUID voucherId;
}
