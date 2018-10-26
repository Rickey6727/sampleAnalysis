select
  /*%expand*/*
from
  Foo
where
  f1 = /* f1 */1
  and
  f2 = /* f2 */'a'
