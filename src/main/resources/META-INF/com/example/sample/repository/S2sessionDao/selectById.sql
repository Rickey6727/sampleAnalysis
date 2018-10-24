select
  /*%expand*/*
from
  s2session
where
  session_id = /* sessionId */'a'
  and
  name = /* name */'a'
