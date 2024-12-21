(function main() {
    const validatingBlocks = {
        instituteEmail: {
            tag: $('input[name=instituteEmail]'),
            validate: (value) => (/^([^@\s]+)@(gmail\.com)$/).test(value),
            errorMessage: "Nhập đúng định dạng name01@gmail.com",
        },
    };

    customizeClosingNoticeMessageEvent();
    createErrBlocksOfInputTags(validatingBlocks);
    customizeValidateEventInputTags(validatingBlocks);
    customizeToggleDisplayPasswordEvent();
    customizeSubmitFormAction('div#center-block > form', validatingBlocks);
    removePathAttributes();
})();
