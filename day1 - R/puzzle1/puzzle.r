callibrations <- readLines('./input')

df = data.frame(raw=callibrations)

df$digits <- as.numeric(gsub("\\D", "", df$raw))

df$first <- substr(df$digits,1,1)
df$last <- substr(df$digits, nchar(df$digits), nchar(df$digits))

df$coord <- as.numeric(paste(df$first, df$last, sep = ""))

sum(df$coord)