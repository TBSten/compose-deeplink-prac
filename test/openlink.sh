
# deeplinkのテスト用adbコマンドのショートカット
# refs: https://developer.android.com/training/app-links/verify-android-applinks#auto-verification

if [ -z "$1" ] || [ -z "$2" ] ; then
    echo "エラー:不正な引数です。以下の形式で実行してください。"
    echo "sh ./test/openlink.sh デバイスID 開くリンク"
    echo "  例) ./test/openlink.sh emulator-5555 \"https://example.com\""
    exit 1
fi

echo "> - device:   $1"
echo "> - link:     $2"

echo "> "
echo "> - run command:"
echo ">     adb -s $1 shell am start -a android.intent.action.VIEW \\"
echo ">         -c android.intent.category.BROWSABLE \\"
echo ">         -d $2"
echo "> "

adb -s $1 shell am start -a android.intent.action.VIEW \
    -c android.intent.category.BROWSABLE \
    -d $2
