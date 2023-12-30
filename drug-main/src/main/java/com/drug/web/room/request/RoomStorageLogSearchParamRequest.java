package com.drug.web.room.request;

import com.drug.api.response.CommonPageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoomStorageLogSearchParamRequest extends CommonPageRequest {

    protected String drugName;
    protected Integer typeId;

}
