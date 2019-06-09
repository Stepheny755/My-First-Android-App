package test.testapplication

class TranslateFunctions {
    companion object {
        fun oob(str: String): String {
            return str.replace(Regex("""[aeiuo]"""), "oob").replace(Regex("""([^aeiou(oob)])([y])"""), "$1oob")
        }

        fun translatemock(str: String): String {
            var s = "";
            var i = 0;
            for (char in str) {
                if (!char.isLetter()) {
                    s += char;
                } else {
                    when (i % 2) {
                        1 -> {
                            s += char.toLowerCase();
                        }
                        0 -> {
                            s += char.toUpperCase();
                        }
                    }
                    i++;
                }
            }
            return s;
        }

        fun translateowo(str: String): String {
            var s = str.replace(Regex("""[rl]"""), "w")
            s = s.replace(Regex("""[RL]"""), "W")
            s = s.replace(Regex("""[n]([aeiou])"""), "ny$1")
            s = s.replace(Regex("""[N]([aeiouAEIOU])"""), "Ny$1")
            s = s.replace(Regex("""ove"""), "uv")
            return s;
        }
    }
}