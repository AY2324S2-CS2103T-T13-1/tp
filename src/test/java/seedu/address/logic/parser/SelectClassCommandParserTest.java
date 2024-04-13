package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_CLASS_DISPLAYED_INDEX;
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import org.junit.jupiter.api.Test;
import seedu.address.logic.commands.RemoveClassCommand;
import seedu.address.logic.commands.SelectClassCommand;



public class SelectClassCommandParserTest {
    private SelectClassCommandParser parser = new SelectClassCommandParser();
    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                SelectClassCommand.MESSAGE_USAGE));
    }
    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                SelectClassCommand.MESSAGE_USAGE));
    }
}
