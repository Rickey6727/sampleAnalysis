select
  /*%expand*/*
from
  m_survey_question_country
where
  survey_question_id = /* surveyQuestionId */1
  and
  country_cd = /* countryCd */1
