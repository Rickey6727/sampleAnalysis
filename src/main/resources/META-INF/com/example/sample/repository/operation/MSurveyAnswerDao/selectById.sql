select
  /*%expand*/*
from
  m_survey_answer
where
  survey_answer_id = /* surveyAnswerId */1
  and
  index = /* index */1
