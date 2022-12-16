-- member create seq
CREATE SEQUENCE member_seq START WITH 1;

CREATE TRIGGER member_bi
    BEFORE INSERT ON task."ob_member"
    FOR EACH ROW
BEGIN
    SELECT member_seq.nextval
    INTO :new.member_id
    FROM dual;
END;