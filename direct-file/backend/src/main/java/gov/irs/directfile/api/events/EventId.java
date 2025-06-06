package gov.irs.directfile.api.events;

public enum EventId {
    TAX_RETURN_CREATE,
    TAX_RETURN_UPDATE,
    TAX_RETURN_SUBMIT,
    TAX_RETURN_SIGN,
    TAX_RETURN_GET_STATUS,
    TAX_RETURN_GET_STATUS_INTERNAL,
    TAX_RETURN_GET_BY_TAXRETURNID,
    TAX_RETURN_GET_ALL_BY_USERID,
    TAX_RETURN_DELETE,
    TAX_RETURN_PREVIEW,
    TAX_RETURN_GET_POPULATED_DATA,
    TAX_RETURN_GET_RETURN_PREFERENCES,
    USER_INFO_GET,
    CREATE_STATE_TAX_AUTHORIZATION_CODE,
    PDF_READ,
    GET_STATE_PROFILE,
    CREATE_XML,
    KEEP_ALIVE,
    GET_STATE_EXPORTED_FACTS_INTERNAL,
}
