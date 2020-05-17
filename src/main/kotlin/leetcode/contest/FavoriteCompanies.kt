package leetcode.contest

class FavoriteCompanies {

    fun peopleIndexes(favoriteCompanies: List<List<String>>): List<Int> {
        val ans = mutableListOf<Int>()
        for (person in favoriteCompanies.indices) {
            val companies = favoriteCompanies[person]
            var count = 0

            for (otherPerson in favoriteCompanies.indices) {
                if (otherPerson != person) {
                    val otherCompanies = favoriteCompanies[otherPerson]
                    if (companies.all { otherCompanies.contains(it) })
                        break
                    count++

                    if (count == favoriteCompanies.size - 1) ans.add(person)
                }
            }
        }

        return ans
    }
}
