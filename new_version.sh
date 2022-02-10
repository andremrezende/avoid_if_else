 [[ $(grep --count "{version}" CHANGELOG.md) -ne 1 ]] && echo "Placeholder {version} not defined in CHANGELOG.md" && exit 1
 [[ $(grep --count "{date}" CHANGELOG.md) -ne 1 ]] && echo "Placeholder {date} not defined in CHANGELOG.md" && exit 1
 [[ $(grep --fixed-strings --count "# $VERSION" CHANGELOG.md) -ne 0 ]] && echo "Version $VERSION already defined in CHANGELOG.md" && exit 1

 sed -i 's/{version}/'"$VERSION"'/' CHANGELOG.md
 sed -i 's!{date}!'"$DATE"'!' CHANGELOG.md
