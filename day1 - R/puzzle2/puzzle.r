callibrations <- readLines('./input')

df = data.frame(raw=callibrations)

df$replaced <- df$raw

# handle circular references


df$replaced <- gsub("twone", 21, df$replaced)
df$replaced <- gsub("sevenine", 79, df$replaced)
df$replaced <- gsub("eightwo", 82, df$replaced)
df$replaced <- gsub("eighthree", 83, df$replaced)
df$replaced <- gsub("nineight", 98, df$replaced)
df$replaced <- gsub("fiveight", 58, df$replaced)
df$replaced <- gsub("oneight", 18, df$replaced)
df$replaced <- gsub("threeight", 38, df$replaced)

df$replaced <- gsub("four", 4, df$replaced)
df$replaced <- gsub("five", 5, df$replaced)
df$replaced <- gsub("six", 6, df$replaced)
df$replaced <- gsub("seven", 7, df$replaced)
df$replaced <- gsub("nine", 9, df$replaced)

df$replaced <- gsub("one", 1, df$replaced)
df$replaced <- gsub("eight", 8, df$replaced)
df$replaced <- gsub("three", 3, df$replaced)
df$replaced <- gsub("two", 2, df$replaced)

df$digits <- as.numeric(gsub("\\D", "", df$replaced))

df$first <- substr(df$digits,1,1)
df$last <- substr(df$digits, nchar(df$digits), nchar(df$digits))

df$coord <- as.numeric(paste(df$first, df$last, sep = ""))

df

sum(df$coord)
