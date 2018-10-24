select
  /*%expand*/*
from
  t_survey_answer
where
  account_id = /* accountId */1
  and
  survey_id = /* surveyId */1
  and
  answer_id = /* answerId */1
  and
  index = /* index */1
